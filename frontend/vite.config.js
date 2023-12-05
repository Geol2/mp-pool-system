import { defineConfig, loadEnv } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default ({ command, mode }) => {

  const env = loadEnv(mode, process.cwd(), '')

  return defineConfig({
    plugins: [vue()],
    define: {
      __APP_ENV__: JSON.stringify(env.APP_ENV),
      __SERVER_ROOT__: JSON.stringify(env.SERVER_ROOT)
    }
  })
}