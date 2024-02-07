
<script setup lang="ts">
const { locales, locale, setLocale } = useI18n();
const language = computed({
    get: () => locale.value,
    set: (value) => {
        setLocale(value);
    },
})
</script>
<template>
    <select v-model="language" class="bg-black font-bold rounded border-white border text-white">
        <option v-for="item in locales" :key="(typeof item === 'object' ? item.code : item)"
            :value="(typeof item === 'object' ? item.code : item)">
            {{ (typeof item === 'object' ? item.name : item) }}
        </option>
    </select>
</template>