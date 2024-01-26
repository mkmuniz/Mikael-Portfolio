<template>
    <nav class="text-white w-full font-hubot flex justify-center">
        <div class="flex w-screen 3xl:container 3xl:mx-auto">
            <NuxtLink to="/">
                <NuxtImg src="/images/logo.png" class="w-12 m-6" />
            </NuxtLink>
            <div :class="['w-full sm:flex items-center justify-end overflow-hidden']">
                <ul class="sm:visible hidden sm:flex space-x-3 text-xl m-6">
                    <li>
                        <NuxtLink to="#about" class="group hover:text-standard transition duration-300">
                            ABOUT ME
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="#experience" class="group hover:text-standard transition duration-300">
                            EXPERIENCE
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="#skills" class="group hover:text-standard transition duration-300">
                            SKILLS
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="#projects" class="group hover:text-standard transition duration-300">
                            PROJECTS
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="#contact" class="group hover:text-standard transition duration-300">
                            CONTACT
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                </ul>
            </div>
            <div class="flex justify-end items-center">
                <HamburgerButton :getNavBarStatus="getNavBarStatus" />
            </div>
        </div>
    </nav>
</template>

<script>
import HamburgerButton from '../HamburgerButton/index.vue';
export default {
    name: "NavBar",
    data() {
        return {
            status: false
        }
    },
    components: {
        HamburgerButton
    },
    methods: {
        getNavBarStatus(status) {
            this.status = status
        }
    }
}
</script>