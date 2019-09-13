<template>
  <div>
    <div style="text-align: left;position: absolute;line-height: 46px;">Tổng số <span class="text-bold primary--text">{{total}}</span> bản ghi. </div>
    <div v-if="total > 0" class="pagination" style="justify-content: flex-end; -webkit-justify-content: flex-end;width: 376px;float: right;">
      <v-layout  align-center justify-end row fill-height>
        <div class="xs2 flex">
          <v-select
            v-model="pagesize"
            v-bind:items="pageSizeData"
            @input="goToPage"
            width="47"
          ></v-select>
        </div>
        <div class="xs5 flex">
          <ul class="tiny-pagination" :class="customClass">
            <li class="page-item" :class="classFirstPage">
              <button @click.prevent="lastPageLast" class="pagination__navigation">
                <span>&lt;&lt;</span>
              </button>
            </li>
            <li class="page-item" :class="classFirstPage">
              <button @click.prevent="lastPage" class="pagination__navigation" style="border-left: 0;">
                <span>&lt;</span>
              </button>
            </li>
            <li class="page-item" style="margin-right: 0;">
              <button class="pagination__navigation pagination__navigation--disabled text-bold primary--text" style="border-right: 0; border-left: 0;">
                {{page}}
              </button>
            </li>
            <li class="page-item" :class="classLastPage" style="margin-right: 0;">
              <button  @click.prevent="nextPage" class="pagination__navigation" style="border-right: 0;">
                <span>&gt;</span>
              </button>
            </li>
            <li class="page-item" :class="classLastPage">
              <button @click.prevent="nextPageLast" class="pagination__navigation">
                <span>&gt;&gt;</span>
              </button>
            </li>
          </ul>
        </div>
      </v-layout>
    </div>
  </div>
</template>

<script>
const COMPONENT_NAME = 'TinyPagination'

export default {
  name: COMPONENT_NAME,
  props: {
    page: {
      type: Number,
      default: 1
    },
    pagesize: {
      type: Number,
      default: 10
    }
  },
  data () {
    return {
      pageSizeData: [10, 20, 30, 100]
    }
  },
  created () {
   console.log(this.total)
  },
  computed: {
    total () {
      return this.$store.getters["category/totalCategory"]
    },
    pageMax () {
      return Math.ceil(this.total/this.pagesize)
    }
  },
  methods: {
    nextPageLast () {
      if(this.page < this.pageMax) {
        this.$emit('tiny:change-page', {
          page: this.pageMax,
          pagesize: this.pagesize
        })
      }
    },
    nextPage () {
      if(this.page !== this.pageMax) {
        this.page += 1
        this.$emit('tiny:change-page', {
          page: this.page,
          pagesize: this.pagesize
        })
      }
    },
    lastPage () {
      if(this.page > 1) {
        this.page -= 1
        this.$emit('tiny:change-page', {
          page: this.page,
          pagesize: this.pagesize
        })
      }
    },
    lastPageLast () {
      if(this.page > 1) {
        this.$emit('tiny:change-page', {
          page: 1,
          pagesize: this.pagesize
        })
      }
    },
    goToPage () {
      this.page = 1,
      this.$emit('tiny:change-page', {
        page: 1,
        pagesize: this.pagesize
      })
    }
  }
}
</script>
<style>
.tiny-pagination {
    display: flex;
    list-style: none;
    margin: .2rem 0;
    padding: .2rem 0;
}
.page-item {
  margin: .2rem .05rem;
}
body .pagination button {
    box-shadow: none;
    margin: 0;
    border: 1px solid #ccc;
    border-radius: 0;
    font-size: 13px;
    width: 28px;
    height: 30px;
    
}
.pagination__navigation .material-icons{
  font-size: 17px;
  line-height: 30px;
}
.pagination {
  margin: 0px 0;
}
</style>

<style scoped>
.v-input{
  font-size: 13px;
}
.v-select__selection--comma{
  margin: 0px 0px 0px 0px;
}
.pagination__navigation i{
  color: #0000008a;
}
</style>

