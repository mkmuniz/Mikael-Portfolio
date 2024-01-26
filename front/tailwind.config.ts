import type { Config } from 'tailwindcss'

/** @type {import('tailwindcss').Config} */
export default <Partial<Config>>{
  content: [
    // other files...
    "./node_modules/flowbite/**/*.{js,ts}"
  ],
  theme: {
    extend: {
      screens: {
        '3xl': { 'min': '1440px' }
      },
      plugins: [
        require('flowbite/plugin')
      ],

      colors: {
        standard: "#FC1616"
      },
      fontFamily: {
        hubot: ['HUBOT', 'cursive'],
      },
      container: {
        padding: {
          DEFAULT: '1rem',
          sm: '2rem',
          lg: '4rem',
          xl: '5rem',
          '2xl': '6rem',
        },
      },
    }
  }
}
