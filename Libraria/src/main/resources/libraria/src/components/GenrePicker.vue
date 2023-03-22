<template>
    <div>
        <form >
            <select v-model="genre" @click="filterBooks"><!-- add a default value and remove the label-->
                <option>Fantasy</option>
                <option>Gore</option>
                <option>Adventure</option>
            </select>
        </form>
    </div>
</template>

<script>
export default {
    data (){
        return{
            genre: '', 
        }
    },
    methods: {
        filterBooks(){
            this.$emit('filter',this.genre)
        }
    }
}

</script>


