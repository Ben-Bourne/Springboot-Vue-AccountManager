<template>
  <div>
    <NavigationBar></NavigationBar>
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
        <tr v-for="account in accounts">
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
import Vue from 'vue'
import axios from 'axios'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import NavigationBar from './NavigationBar.vue'

export default {
  name: 'ViewAll',
  components: {
    NavigationBar
  },
  data() {
    return {
      accounts: []
    }
  },
  mounted(){
    this.loadAccount();
  },
  methods: {
    loadAccount: function(){
      var vm = this;
      axios.get('http://localhost:8080/api/getall')
      .then(function(response){
        console.log(response);
        vm.accounts = response.data;
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
