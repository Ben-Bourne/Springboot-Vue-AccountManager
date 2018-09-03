<template>
  <div>
    <NavigationBar></NavigationBar>
    <div style="background-color:lightblue">
      <br>
      <p>ID: <input v-model="searchId"></p>
      <p><button type="submit" class="button" @click="findAccount">Search</button></p>
      <br>
    </div>
    <table class="table table-striped table-borders">
      <thead>
        <tr>
          <th>ID</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Account Number</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>{{ account.id }}</td>
          <td>{{ account.firstName }}</td>
          <td>{{ account.lastName }}</td>
          <td>{{ account.accountNumber }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import NavigationBar from './NavigationBar.vue'
import axios from 'axios'
export default {
  name: 'Search',
  components: {
    NavigationBar
  },
  data() {
  return {
    account: ''
    }
  },
  created: function(){
    this.findAccount();
  },
  methods: {
    findAccount: function(){
      var vm = this;
      axios.get('http://localhost:8080/api/get/' + this.searchId)
      .then(function(response){
        console.log(response);
        vm.account = response.data;
        console.log(vm.account);
      })
      .catch(function(error){
        console.log(error);
      });
    }
  }
}

</script>

<style>

</style>
