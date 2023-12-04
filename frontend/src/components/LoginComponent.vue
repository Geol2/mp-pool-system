<template>
    <div>
        <div class="d-flex">
            <div class="display-4 p-2">
                mp-pool
            </div>
            <div class="version-tag"> v.1.0 </div>
        </div>

        <div class="container-fluid m-3 p-3 suit rounded">
            <form>
                <div class="mb-3">
                    <div class="text-left">아이디</div>
                        <label>
                            <input type="text" name="userId" id="id" class="form-control"
                                   value="" placeholder="아이디를 입력하세요" />
                        </label>
                    <div class="error-id"></div>
                </div>

                <div class="mb-3">
                    <div class="text-left">비밀번호</div>
                    <label>
                        <input type="password" name="password" id="pwd" class="form-control"
                               value="" placeholder="비밀번호를 입력하세요" />
                    </label>
                    <div class="error-password"></div>
                </div>
                <button>로그인</button>
                <div class="m-3">
                    * 회원 가입요청은 별도로 신청해주세요.
                </div>
            </form>
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
<script setup>

</script>