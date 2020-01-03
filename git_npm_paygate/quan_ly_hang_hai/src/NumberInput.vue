<template id="custominput">
  <input type="text" style="width: 100%; max-width: -webkit-fill-available; position: relative; border: 1px solid blue; height: 22px;" class="form-control input-number" @keydown.up.prevent="increment" @keydown.down.prevent="decrement" :value="active?val:formatted" @blur="update" @keyup.enter.stop="update" @focus="active = true">
</template>

<script>
  export default {
    data () {
      return {
        active: false
      }
    },
    props: {
      value: {type: Number, default: 0},
      min: {type: Number, default: 0},
      max: {type: Number, default: 100000000},
      step: {type: Number, default: 10000},
      decimals: {type: Number, default: 0},
      type: {default: 'currency'}
    },
    mounted () {
    },
    computed: {
      val: function () {
        if (this.type === 'currency') {
          return Number(this.value)
        } else if (this.type === 'none') {
          return Number(this.value) + ''
        } else if (this.type === 'percent') {
          return Number(this.value * 100).toFixed(3)
        }
      },
      formatted: function () {
        if (this.type === 'currency') {
          return this.formatAsCurrency(this.value, this.decimals)
          // eslint-disable-next-line
          // return Number(this.value + ''.replace(/[^0-9\.]+/g, ''))
        } else if (this.type === 'none') {
          // eslint-disable-next-line
          return Number(this.value + ''.replace(/[^0-9\.]+/g, '')).toFixed(this.decimals) + ''
        } else if (this.type === 'percent') {
          return (this.value * 100).toFixed(this.decimals) + '%'
        }
      }
    },
    methods: {
      formatAsCurrency: function (value, dec) {
        dec = dec || 0
        // console.log('value.toFixed(dec)++++++++replace', value.toFixed(dec).replace(/(\d)(?=(\d\d\d)+(?!\d))/g, '$1,')) replace('.', ',')
        return value.toFixed(dec).replace(/(\d)(?=(\d\d\d)+(?!\d))/g, '$1,')
      },
      increment: function (e) {
        if (e.shiftKey) {
          this.value += 10 * this.step
        } else {
          this.value += this.step
        }
        if (this.value > this.max) {
          this.value = this.max
        }
        this.changed()
      },
      decrement: function (e) {
        if (e.shiftKey) {
          this.value -= 10 * this.step
        } else {
          this.value -= this.step
        }
        if (this.value < this.min) {
          this.value = this.min
        }
        // console.log('decrement +++++++++value+++++++++', this.value)
        this.changed()
      },
      update: function () {
        this.active = false
        // console.log(this.$el)
        var tempVal = this.$el.value + ''
        // eslint-disable-next-line
        this.value = Number(tempVal.replace(/[^0-9\.]+/g, ''))
        if (this.type === 'percent') {
          this.value /= 100
        }
        // let dec = this.decimals || 0
        // this.value = this.value ? this.value.toFixed(dec) : 0
        this.changed()
      },
      changed: function () {
        this.$emit('input', Number(this.value))
      }
    },
    filters: {
    }
  }
</script>

