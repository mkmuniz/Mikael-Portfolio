<template>
    <footer>
        <div class="w-full max-w-screen-xl mx-auto p-4 md:py-8 font-bold">
            <div class="flex items-center justify-center">
                <ul class="flex flex-wrap items-center text-xl mb-6 font-bold sm:mb-0 text-white">
                    <li>
                        <NuxtLink to="#about" class="group hover:text-standard transition duration-300 me-4 md:me-6">
                            {{ $t("footer.about") }}
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="https://github.com/mkmuniz"
                            class="group hover:text-standard transition duration-300 me-4 md:me-6" :target="'_blank'">
                            {{ $t("footer.github") }}
                        </NuxtLink>
                    </li>
                    <li>
                        <NuxtLink to="https://linktr.ee/mkmuniz"
                            class="group hover:text-standard transition duration-300 me-4 md:me-6" :target="'_blank'">
                            {{ $t("footer.linktree") }}
                        </NuxtLink>
                    </li>
                </ul>
            </div>
            <hr class="my-6 sm:mx-auto lg:my-8" />
            <span class="block text-sm text-center text-white">© 2024 <NuxtLink
                    href="https://www.mkmuniz.dev" class="hover:underline">Mikael™</NuxtLink>. {{
                        $t("footer.rights") }}</span>
        </div>
    </footer>
</template>