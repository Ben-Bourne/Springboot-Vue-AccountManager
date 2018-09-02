<template>
  <div>
    <NavigationBar></NavigationBar>
    <h1>This is the view all</h1>
    <div>
      <div class="account" v-for="account in accounts" :key="account.id">
        <h1>Title: {{ account.title }}</h1>
        <p>Description: {{ account.body }}</p>
      </div>
    </div>
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
  mounted: function(){
    this.loadAccount();
  },
  methods: {
    loadAccount: function(){
      var vm = this;
      axios.get('http://locatlhost:8080/api/getall')
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
