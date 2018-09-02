<template>
  <div>
    <NavigationBar></NavigationBar>
    <div align="left" style="background-color:lightblue">
      <br>
      <p>ID     : <input v-model="Account.id"></p>
      <p>First name     : <input v-model="Account.firstName"></p>
      <p>Last name      : <input v-model="Account.lastName"></p>
      <p>Account number : <input v-model="Account.accountNumber"></p>
      <p><button type="submit" class="button" @click="addAccount">Submit</button></p>
      <br>
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
      .catch(function(error){
        console.log(error);
      });
    },
  }
}
</script>

<style>

</style>
