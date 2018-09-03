<template>
  <div style="background-color:lightblue; height: 500px">
    <NavigationBar></NavigationBar>
    <br>
    <div style="position: absolute; left: 100px;" align="left">
      <p>First name     : </p>
      <p>Last name      : </p>
      <p>Account number : </p>
      <p><button type="submit" class="button" @click="addAccount">Submit</button></p>
    </div>
    <div style="position: absolute; left: 300px;">
      <p><input v-model="Account.firstName"></p>
      <p><input v-model="Account.lastName"></p>
      <p><input v-model="Account.accountNumber"></p>
    </div>
    <br>
    <div>
      <br>
      <p style="position: absolute; left: 100px; top: 400px" align="left">ID: </p><input v-model="id" style="position: absolute; left: 300px; top: 400px">
      <p style="position: absolute; left: 100px; top: 450px"><button type="submit" class="button" @click="deleteAccount">Delete</button></p>
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
      .then(alert("Account added"))
      .catch(function(error){
        console.log(error);
      });
    },
    deleteAccount(){
      console.log(this.id);
      axios.delete('http://localhost:8080/api/delete/' + this.id)
      .then(alert("Account deleted"))
      .catch(function(error){
        console.log(error);
      });
    }
  }
}
</script>

<style>

</style>
