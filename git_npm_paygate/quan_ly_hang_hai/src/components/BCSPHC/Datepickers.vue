<template>
  <v-container grid-list-md>
    <v-layout row wrap>
      <v-flex xs12 lg6>
        <v-menu
          ref="menu1"
          :close-on-content-click="false"
          v-model="menu1"
          :nudge-right="40"
          lazy
          transition="scale-transition"
          offset-y
          full-width
          max-width="290px"
          min-width="290px"
        >
          <v-text-field
            slot="activator"
            v-model="ownNotifications.penaltyDate"
            persistent-hint
            prepend-icon="event"
            
          ></v-text-field>
          <v-date-picker v-model="date1" no-title @input="menu1 = false"></v-date-picker>
        </v-menu>
      </v-flex>

      <v-flex xs12 lg6>
        <v-menu
          :close-on-content-click="false"
          v-model="menu2"
          :nudge-right="40"
          lazy
          transition="scale-transition"
          offset-y
          full-width
          max-width="290px"
          min-width="290px"
        >
          <v-text-field
            slot="activator"
            v-model="computedDateFormatted"
            persistent-hint
            prepend-icon="event"
            readonly
          ></v-text-field>
          <v-date-picker v-model="date" no-title @input="menu2 = false"></v-date-picker>
        </v-menu>
      </v-flex>
    </v-layout>
  </v-container>
</template>
<script>
  export default {
    data: () => ({
      date: null,
      date1: null,
      menu1: false,
      menu2: false,
      ownNotifications: {}
    }),

    computed: {
      computedDateFormatted () {
        return this.formatDate(this.date)
      },
      penaltyDate (val) {
        return this.formatDate1(this.date1)
      }
    },
    watch: {
      penaltyDate () {
        this.ownNotifications.penaltyDate = this.formatDate1(this.date1)
      }
    },
    methods: {
      formatDate (date) {
        if (!date) return null

        const [year, month, day] = date.split('-')
        return `${day}/${month}/${year}`
      },
      formatDate1 (date1) {
        if (!date1) return null

        const [year, month, day] = date1.split('-')
        return `${day}/${month}/${year}`
      },
      parseDate (date) {
        if (!date) return null

        const [month, day, year] = date.split('/')
        return `${year}-${month.padStart(2, '0')}-${day.padStart(2, '0')}`
      }
    }
  }
</script>