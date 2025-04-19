<script setup lang="ts">
import { useI18n } from 'vue-i18n'; // Verifique se você está importando o pacote corretamente

const { locale, setLocale } = useI18n();
const selectedLanguage = ref(locale.value);

const brazilFlagIcon = 'https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Brazilian_flag_icon_square.svg/1200px-Brazilian_flag_icon_square.svg.png';
const USFlagIcon = 'https://cdn4.iconfinder.com/data/icons/square-world-flags/180/flag_us_america_united_states_square-512.png';

const selectLanguage = async () => {
    if (locale.value === 'pt-BR') {
        await setLocale('en-US');
        selectedLanguage.value = locale.value;
    } else {
        await setLocale('pt-BR');
        selectedLanguage.value = locale.value;
    }
};

</script>

<template>
    <div class="bg-black font-bold rounded text-white">
        <div @click="selectLanguage()" :class="['cursor-pointer']">
            <NuxtImg :src="(selectedLanguage === 'pt-BR' ? brazilFlagIcon : USFlagIcon )"
                class="w-8 rounded-full" alt="Country Language Flag" />
        </div>
    </div>
</template>
