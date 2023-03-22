<template>
    <div class="container">
        <h1>Vault page</h1>
        <GenrePicker @filter="getData($event)"/>
        <div v-for="Book in Books" :key="Book.id" class="Box" >
            <div class="filter" v-if="Book.genre === genre">
                <router-link :to="{name: 'detailBookView', params: {id: Book.id}}">
                    <img :src="Book.image">
                    <h1>{{Book.title }} </h1>
                </router-link>
            </div>
        </div>        
    </div>
    
</template>

<script>
import GenrePicker from '../components/GenrePicker'
import BookService from '../services/BookService'

export default {
    name: 'GenreP',
    components: {GenrePicker},
    data() {
        return{
            Books: [],
            genre: ''          
        }
    },
    //mounted(){
      //  fetch('http://localhost:3000/Books')
    //.then(res => res.json())
    //.then(data => this.Books = data)
    //.catch(err => console.log(err.message))
    //},
    methods:{
        getData(data){
                this.genre = data
        },
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
.Box img{
    width: 100%;
    height: auto;
}

.Box{
  width: 20%;
  margin: 15px;
  border: 1px solid #ccc;
  display: inline-block;
  box-shadow: 0 8px 12px 1px rgb(29 17 51 / 4%), 0 3px 16px 2px rgb(9 32 77 / 12%), 0 5px 10px -3px rgb(29 17 51 / 12%);
}
</style>