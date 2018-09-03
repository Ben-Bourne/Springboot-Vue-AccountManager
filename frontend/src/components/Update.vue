<template>
  <div style="background-color:lightblue; height: 400px">
    <NavigationBar></NavigationBar>
    <div style="position: absolute; left: 100px;" align="left">
      <br>
      <p>ID     :</p>
      <p>First name     :</p>
      <p>Last name      :</p>
      <p>Account number :</p>
      <p><button type="submit" class="button" @click="addAccount">Submit</button></p>
      <br>
    </div>
    <div style="position: absolute; left: 300px; top: 150px">
      <p><input v-model="Account.id"></p>
      <p><input v-model="Account.firstName"></p>
      <p><input v-model="Account.lastName"></p>
      <p><input v-model="Account.accountNumber"></p>
    </div>
  </div>
</template>

<script>
import NavigationBar from './NavigationBar.vue'
import axios from 'axios'
export default {
  name: 'Update',
  data() {
    return{
      Account: {id: '', firstnName: '', lastName: '', accountNumber: ''},
    }
  },
  components: {
    NavigationBar
  },
  methods: {
    addAccount(){
      const addUser = {
        id: this.Account.id,
        firstName: this.Account.firstName,
        lastName: this.Account.lastName,
        accountNumber: this.Account.accountNumber
      }
      console.log(addUser);
      axios.put('http://localhost:8080/api/update', addUser)
      .then(alert("Account updated"))
      .catch(function(error){
        console.log(error);
      });
    },
  }
}
</script>

<style>

</style>
