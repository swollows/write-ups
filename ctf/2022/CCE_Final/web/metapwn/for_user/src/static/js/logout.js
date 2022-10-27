function eraseCookie(name) {
  document.cookie = name + '=; Max-Age=-99999999;';
}
eraseCookie('token')
alert('Done')
location.href = '/'