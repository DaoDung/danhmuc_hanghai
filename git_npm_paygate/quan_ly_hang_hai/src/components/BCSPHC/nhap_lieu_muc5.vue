<template>
  <div>
    <v-data-table
      hide-default-footer
      :items="muc5"
      class="elevation-1 xoa"
    >
      <template v-slot:header="{ props: { headers } }">
          <thead>
            <tr>
              <td class="text-xs-left font-weight-regular" style="width:10%;">
                Mục 5
              </td>
              <td class="text-xs-left font-weight-regular" style="width:60%;">
               Vi phạm quy định về hoa tiêu hàng hải
              </td>
              <td class="text-xs-center" style="width:15%;">
                <vue-numeric class="input-crurency" v-if="status" style="width: 100%; text-transform: none; font-weight: 400;" currency-symbol-position="suffix" currency="đ" separator="," v-model="totalCash" min="0" max="9999999999999999999" ></vue-numeric>
              </td>
              <td class="text-xs-center" style="width: 10%;">
                <v-btn color="" v-model="status"  small class="btn-hanhchinh" @click="status = !status" >
                    <div v-if="status">Áp dụng</div>
                    <div v-else >Không áp dụng</div>
                </v-btn>
              </td>
              <td style="width: 5%;">
                <span class="hide-hanhchinh" @click="isHide=!isHide">{{isHide ? 'Ẩn': 'Xem'}}</span>
              </td>
            </tr>
          </thead>
      </template>
      <template v-slot:body="{ items }">
        <tbody v-if="isHide">
          <tr v-for="item in items" :key="item.name">
                <td class="text-xs-left no-results-text"  >{{ item.order }} <v-icon v-if="item.result && item.order === '' " color='red'>mdi-account-check-outline</v-icon> </td>
                <td class="text-xs-left" >{{ item.content }}</td>
                <td class="text-xs-right" >

                      <vue-numeric class="input-crurency" v-if="item.result && item.order === ''" style="width: 100%; text-transform: none; font-weight: 400;" currency-symbol-position="suffix" currency="đ" separator="," v-model="item.value" min="0" max="9999999999999999999" ></vue-numeric>
                    
                </td>
                <td class="text-xs-center py-0 mx-0 my-0"    >
                  <v-btn
                  @click="item.result = !item.result"
                  v-if="item.order === '' "
                  small
                  class="btn-hanhchinh"
                  >
                      <div v-if="item.result">Áp dụng </div>
                      <div v-else >Không áp dụng</div>
                  </v-btn>
                </td>
                <td></td>
          </tr>
        </tbody>
      </template>
    </v-data-table>
  </div>
</template>
<script>

export default {
  data: () => ({
    isHide: false,
    results: false,
    money: {
      decimal: ',',
      thousands: '.',
      prefix: ' ',
      suffix: '',
      precision: null,
      masked: false
    },
    headers: [
      {
        text: 'Mục 5',
        value: 'calories',
        align: 'center',
        sortable: true,
        width: '10%'
      },
      {
        text: 'Vi phạm quy định về hoa tiêu hàng hải',
        value: 'calories',
        align: 'center',
        sortable: true,
        width: '50%'
      }
    ]
  }),
  props: {
    muc5: {
      type: Array,
      default: () => {
        return []
      }
    },
    status: {
      type: Boolean,
      default: () => {
        return false
      }
    },
  },
  computed: {
    totalCash () {
      let sum = 0
      this.muc5.forEach(element => {
        sum+= parseInt(element.value)
      });
      return sum
    }
  },
  watch: {
    'muc5': {
      handler: () => {
        
      },
      deep: true
    },
    status(val){
      this.$emit('changeStatus', val)
    }
  }
}
</script>

