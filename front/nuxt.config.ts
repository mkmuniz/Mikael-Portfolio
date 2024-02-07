// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  devtools: { enabled: true },
  modules: ['@nuxtjs/tailwindcss', 'nuxt-icon', '@nuxt/image', '@nuxtjs/i18n'],
  i18n: {
    lazy: false,
    langDir: "locales",
    strategy: "no_prefix",
    locales: [
      {
        code: 'pt-BR',
        iso: 'pt-BR',
        name: 'pt-BR',
        file: 'pt-BR.json'
      },
      {
        code: 'en-US',
        iso: 'en-US',
        name: 'en-PT',
        file: 'en-US.json'
      },
    ],
    defaultLocale: "pt-BR"
  },
  devServer: {
    port: Number(process.env.PORT)
  },
  hooks: {
    'close': () => {

    }
  },
  app: {
    head: {
      charset: 'utf-8',
      viewport: 'width=device-width, initial-scale=1',
    },
  }
})
