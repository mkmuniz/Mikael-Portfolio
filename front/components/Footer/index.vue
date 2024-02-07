<template>
    <footer>
        <div class="w-full max-w-screen-xl mx-auto p-4 md:py-8 font-bold">
            <div class="flex items-center justify-center">
                <ul class="flex flex-wrap items-center 3xl:text-3xl mb-6 text-sm font-medium sm:mb-0 text-white">
                    <li>
                        <NuxtLink to="#about" class="group hover:text-standard transition duration-300 me-4 md:me-6">ABOUT
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="https://github.com/mkmuniz" class="group hover:text-standard transition duration-300 me-4 md:me-6" :target="'_blank'">GITHUB
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="https://linktr.ee/mkmuniz" class="group hover:text-standard transition duration-300 me-4 md:me-6" :target="'_blank'">LINKTREE
                        </NuxtLink>
                    </li>
                </ul>
            </div>
            <hr class="my-6 sm:mx-auto lg:my-8" />
            <span class="block text-sm text-center 3xl:text-2xl text-white">© 2024 <NuxtLink
                    href="https://www.mkmuniz.dev" class="hover:underline 3xl:text-2xl">Mikael™</NuxtLink>. All Rights Reserved.</span>
        </div>
</footer></template>