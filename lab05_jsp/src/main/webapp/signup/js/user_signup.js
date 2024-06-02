/**
 * user/signup.jsp에 포함됨.
 */

 // HTML DOM(Document Obejct Model) 컨텐트 로딩이 끝났을 때, 이벤트 리스너를 실행.
document.addEventListener('DOMContentLoaded', () => {
    // form 요소를 찾음:
    const signUpForm = document.querySelector('form#signUpForm');
    
    // userid가 입력된 input#id 요소를 찾음:
    const inputUserID = document.querySelector('input#userid');
    
    // 비밀번호가 입력된 input#password 요소(signup.jsp파일에서 input태그의 password속성으로 준 것)를 찾음:
    const inputPassword = document.querySelector('input#password');
    
    // 이메일이 입력된 input태그의 id값 email인 요소를 찾음(signup.jsp에서 찾아서 가져오고 변수에 저장시키는 것 맞나?)
    const inputEmail= document.querySelector('input#email');
    
    // 가입완료 버튼 찾음:
    const btnCreate = document.querySelector('button#btnCreate');
    });
    
    // 가입완료 버튼에 클릭 이벤트 리스너를 설정.
    btnCreate.addEventListener('click', () => {
//        console.log(result); //-> confirm()의 리턴 값은 true(확인 클릭)/fasle(취소 클릭)

            signUpForm.method = 'post'; // 폼 제출 방식 설정.
         //   signUpForm.action = 'signin'; // 폼 제출 요청 주소 설정.
            signUpForm.submit(); // 폼 제출(서버로 요청을 보냄).
            alert('🥳 가입을 환영합니다 🎉');
    });
    
        
