<template>
    <div v-if="Books">
        <h1>Title:{{Books.title}}</h1>
        <h2>Genre:{{Books.genre}}</h2>
        <h2>Synopsis:{{Books.synopsis}}</h2>
    </div>
    

    
</template>

<script>
import BookService from '../services/BookService'

export default {

    props: ['id'],
    data(){
      return{
          Books: null
        }
    },
    methods:{
      getBooks(){
            BookService.getBooks().then((response) => {
                this.Books = response.data;
            })
        }
    },
    created(){
        this.getBooks()
    }
}


</script>

<style >
    
</style>