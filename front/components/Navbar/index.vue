<template>
    <nav class="text-white w-full font-hubot flex justify-center sticky top-0 bg-black z-40">
        <div :class="['h-screen w-screen', status ? 'visible' : 'hidden', 'bg-black absolute opacity-50 sm:hidden']" />
        <div class="flex w-screen 3xl:container 3xl:mx-auto">
            <NuxtLink to="/" class="flex items-center justify-center z-30">
                <NuxtImg src="/images/logo.png" class="w-24 ml-6 mt-2" />
            </NuxtLink>
            <div :class="['w-full sm:flex items-center justify-end overflow-hidden']">
                <ul class="sm:visible hidden sm:flex space-x-3 text-xl m-6">
                    <li>
                        <NuxtLink to="/#about" class="group hover:text-standard transition duration-300 text-[16px]">
                            {{ $t("navbar_links.about") }}
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="/#experience" class="group hover:text-standard transition duration-300 text-[16px]">
                            {{ $t("navbar_links.experience") }}
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="/#projects" class="group hover:text-standard transition duration-300 text-[16px]">
                            {{ $t("navbar_links.projects") }}
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="/#reviews" class="group hover:text-standard transition duration-300 text-[16px]">
                            {{ $t("navbar_links.recommendations") }}
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="https://linktr.ee/mkmuniz" class="group hover:text-standard transition duration-300 text-[16px]" :target="'_blank'">
                            {{ $t("navbar_links.contact") }}
                            <span
                                class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                        </NuxtLink>
                    </li>
                    <LangSwitch />
                </ul>
            </div>
            <div class="flex justify-end items-center">
                <HamburgerButton :getNavBarStatus="getNavBarStatus" />
            </div>
        </div>
        <SideNavBar :status="status" />
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