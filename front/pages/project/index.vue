<template>
    <HeaderProject />
</template>

<script setup>
import {  useQuery } from '@tanstack/vue-query'
import { getAllProjects } from '~/server/api/project';

// Query
const { isPending, isError, data, error } = useQuery({
  queryKey: ['todos'],
  queryFn: getAllProjects,
});

</script>