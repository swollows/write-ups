$(document).ready(function () {
  $('#inputID').keyup(function () {
    let username = $(this).val()
    if (username.length < 6) $('#idWarning').css('display', 'block')
    else $('#idWarning').css('display', 'none')
  })

  $('#inputPW').keyup(function () {
    let passwd = $(this).val()
    if (passwd.length < 6) $('#pwWarning').css('display', 'block')
    else $('#pwWarning').css('display', 'none')
  })

  $("#inputPW").keydown(function (key) {
    if (key.keyCode == 13) submit()
  })

  async function submit() {
    const username = $('#inputID').val()
    if (username.length < 6) {
      alert('len(id) >= 6')
      return
    }

    const password = $('#inputPW').val()
    if (password.length < 6) {
      alert('len(pw) >= 6')
      return
    }
    
    axios.post('/api/user/login', { username, password }).then(r => {
      if (r.data.status) {
        alert('Success!')
        setCookie('token', r.data.message, 1)
        location.href = '/'
      } else {
        alert('Error...')
      }
    }).catch(e => {
      if (e.response) {
        const { message } = e.response.data
        if (Object.keys(message).length === 0) {
          alert('Wrong username or password')
        } else {
          alert('Error...')
        }
      } else {
        alert('Error..')
      }
    }) 
  }

  $('#submitBtn').click(submit)
})