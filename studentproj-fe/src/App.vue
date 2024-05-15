<script setup>
import {ref, computed, onBeforeMount} from "vue"
import {getService} from "./functions/fetchService.js"
const API_ROOT = import.meta.env.VITE_API_ROOT;
const students = ref();
const code = ref();

onBeforeMount(async () => {
  let res = await getService(API_ROOT+"/api/students");
  students.value = res.body;
  code.value = res.code;
});
</script>

<template>
  <div v-if="code === 200" container mx-auto object-center>
    <table class="border border-spacing-0.5 center">
        <thead class="border bg-slate-100">
            <tr>
                <th class="px-5 py-3">Student ID</th>
                <th class="px-5 py-3">Firstname</th>
                <th class="px-5 py-3">Lastname</th>
                <th class="px-5 py-3">Major</th>
            </tr>
        </thead>
        <tbody v-for="student in students" :key="student.id" >
          <tr class="border">
            <td class="px-5 py-2">{{ student.id }}</td>
            <td class="px-5">{{ student.firstname }}</td>
            <td class="px-5">{{ student.lastname }}</td>
            <td class="text-center">{{ student.major }}</td>
          </tr>
        </tbody>
    </table>
  </div>
  <div v-else>
    <p class="px-5 py-5 text-xl text-red-500">{{ students }}</p>
  </div>
        
</template>
