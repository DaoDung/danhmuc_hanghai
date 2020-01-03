<template>
  <div id="pagination">
    <div>Tổng số <span class="text-bold primary--text">{{total}}</span></div>
    <div v-if="total > 0" style="width: 50%; display: flex;justify-content: flex-end;">
        <div style="width: 10%;">
          <v-select
            v-model="pagesize"
            v-bind:items="pageSizeData"
            @input="goToPage"
            width="47"
          ></v-select>
        </div>
        <div style="width: 200px;">
          <ul style="padding: 0;">
            <li class="page-item" >
              <button @click.prevent="lastPageLast" class="pagination__navigation">
                <span>&lt;&lt;</span>
              </button>
            </li>
            <li class="page-item" >
              <button @click.prevent="lastPage" class="pagination__navigation">
                <span>&lt;</span>
              </button>
            </li>
            <li class="page-item" >
              <button class="pagination__navigation pagination__navigation--disabled text-bold primary--text">
                {{page}}
              </button>
            </li>
            <li class="page-item" >
              <button  @click.prevent="nextPage" class="pagination__navigation" >
                <span>&gt;</span>
              </button>
            </li>
            <li class="page-item">
              <button @click.prevent="nextPageLast" class="pagination__navigation">
                <span>&gt;&gt;</span>
              </button>
            </li>
          </ul>
        </div>
    </div>
  </div>  
</template>

<script>
const COMPONENT_NAME = 'Pagination'

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
    },
    total: {
      type: Number,
      default: 0
    }
  },
  data () {
    return {
      pageSizeData: [10, 20, 30, 100]
    }
  },
  created () {
  },
  computed: {
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
#pagination {
  width: 100%;
  padding: 10px;
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.page-item{
  list-style: none;
  display: inline;
}
.pagination__navigation{
  width: 18%;
  height: 30px;
  border-top: 1px solid;
  border-left: 1px solid;
  border-bottom:1px solid;
  border-right:1px solid;
}
#pagination .v-text-field {
    padding-top: 0px;
    margin-top: 0px;
}
</style>

