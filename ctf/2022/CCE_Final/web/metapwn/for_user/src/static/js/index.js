function setCookie(name, value, days) {
  let expires;
  if (days) {
    let date = new Date();
    date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
    expires = '; expires=' + date.toGMTString();
  } else {
    expires = '';
  }

  document.cookie = name + '=' + value + expires + '; path=/';
}

function getCookie(name) {
  let i, x, y, ARRcookies = document.cookie.split(';');

  for (i = 0; i < ARRcookies.length; i++) {
    x = ARRcookies[i].substr(0, ARRcookies[i].indexOf('='));
    y = ARRcookies[i].substr(ARRcookies[i].indexOf('=') + 1);

    x = x.replace(/^\s+|\s+$/g, '');

    if (x == name) {
      return unescape(y);
    }
  }
}

$(document).ready(function () {
  if (getCookie('token')) {
    const navbar = $('#adaptiveNavbar')
    navbar.html(`
    <ul class="nav navbar-nav" style="font-size: 18px;">
      <li class="nav-item"><a class="nav-link" href="/room">My Room</a></li>
      <li class="nav-item"><a class="nav-link" href="/friends">Friends</a></li>
      <li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
    </ul>
    `)
  }
})