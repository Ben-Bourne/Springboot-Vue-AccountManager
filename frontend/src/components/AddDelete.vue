<template>
  <div>
    <NavigationBar></NavigationBar>
    <div align="left" style="background-color:lightblue">
      <br>
      <p>First name     : <input v-model="Account.firstName"></p>
      <p>Last name      : <input v-model="Account.lastName"></p>
      <p>Account number : <input v-model="Account.accountNumber"></p>
      <p><button type="submit" class="button" @click="addAccount">Submit</button></p>
      <br>
    </div>
    <br>
    <br>
    <div align="left" style="background-color:lightblue">
      <br>
      <p>ID: <input v-model="id"></p>
      <p><button type="submit" class="button" @click="deleteAccount">Delete</button></p>
      <br>
    </div>
  </div>
</template>

<script>
import NavigationBar from './NavigationBar.vue'
import axios from 'axios'
export default {
  name: 'AddDelete',
  data() {
    return{
      Account: {firstnName: '', lastName: '', accountNumber: ''},
      id: ''
    }
  },
  components: {
    NavigationBar
  },
  methods: {
    addAccount(){
      const addUser = {
        firstName: this.Account.firstName,
        lastName: this.Account.lastName,
        accountNumber: this.Account.accountNumber
      }
      console.log(addUser);
      axios.post('http://localhost:8080/api/add', addUser)
      .catch(function(error){
        console.log(error);
      });
    },
    deleteAccount(){
      console.log(this.id);
      axios.delete('http://localhost:8080/api/delete/' + this.id)
      .catch(function(error){
        console.log(error);
      });
    }
  }
}
</script>

<style>

</style>
