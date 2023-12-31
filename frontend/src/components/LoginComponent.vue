<template>
	<div>
		<div class="d-flex">
			<div class="display-4 p-2">
				mp-pool
			</div>
			<div class="version-tag"> v.0.1 </div>
		</div>

		<div class="container-fluid justify-content-center m-3 p-3 suit rounded">
			<form id="login-form">
				<div class="mb-3">
					<div class="text-left">아이디</div>
					<label>
						<input type="text" name="userId" id="id" class="form-control" value="" placeholder="아이디를 입력하세요" />
					</label>
					<div class="error-id"></div>
				</div>

				<div class="mb-3">
					<div class="text-left">비밀번호</div>
					<label>
						<input type="password" name="userPwd" id="pwd" class="form-control" value="" onkeyup="Enter()"
							placeholder="비밀번호를 입력하세요" />
					</label>
					<div class="error-password"></div>
				</div>

				<div class="m-3">
					* 회원 가입요청은 별도로 신청해주세요.
				</div>
			</form>
			<button @click="onLogin()">로그인</button>
		</div>
		<div class="mt-auto">
			2023 @ Copyright
		</div>
	</div>
</template>

<style scoped>
.container-fluid {
	background-color: white;
	box-shadow: rgba(149, 157, 165, 0.2) 0px 8px 24px;
}

.version-tag {
	color: #2980b9;
	height: 35px;
	border: 1px solid #2980b9;
	border-radius: 5px;
	padding: 5px;
}
</style>

<script>
import { ref, onBeforeMount } from 'vue';

import { setCookie, getCookie } from '/@utils/cookie.js';
import axios from 'axios';

export default {

	setup() {
		let user = ref("");
		let token = ref("");

		onBeforeMount(() => {
			
		});

		return { user, token };
	},

	methods: {
		async onLogin() {
			let form = document.getElementById("login-form");

			try {
				const response = await axios.post(__SERVER_ROOT__ + '/user',
					{
						userId: form[0].value,
						userPwd: form[1].value
					}
				);
				this.user = response.data.user;
				this.token = response.data.token;
			} catch (error) {
				console.log(error);
			}

		}
	}
}
</script>