const displayFriend = () => {
  $('#friends')[0].innerHTML = ''
  axios.get('/api/friend', { headers: { 'Access-Token': getCookie('token') } }).then(r => {
    const { message } = r.data
    const html = ejs.render(`
      <% for(let i = 0; i < message.length; i++) { %>
      <tr>
        <th scope="row"><%= i + 1 %></th>
        <td><%= message[i] %></td>
        <td onclick="visit('<%= message[i] %>')">🏠</td>
      </tr>
      <% } %>
      `, { message })
    $('#friends').append(html)
  }).catch(e => {
    if (e.response) {
      alert('Plz login')
      location.href = '/login'
    }
  })
}

const displayRequest = () => {
  $('#request')[0].innerHTML = ''

  axios.get('/api/friend/request', { headers: { 'Access-Token': getCookie('token') } }).then(r => {
    const { message } = r.data
    console.log(message)
    const html = ejs.render(`
      <% for(let i = 0; i < message.length; i++) { %>
      <tr>
        <th scope="row"><%= i + 1 %></th>
        <td><%= message[i] %></td>
      </tr>
      <% } %>
      `, { message })
    $('#request').append(html)
  }).catch(e => {
    if (e.response) {
      alert('Plz login')
      location.href = '/login'
    }
  })
}

const displayReceive = () => {
  $('#receive')[0].innerHTML = ''
  axios.get('/api/friend/receive', { headers: { 'Access-Token': getCookie('token') } }).then(r => {
    const { message } = r.data
    const html = ejs.render(`
      <% for(let i = 0; i < message.length; i++) { %>
      <tr>
        <th scope="row"><%= i + 1 %></th>
        <td><%= message[i] %></td>
        <td onclick="acceptRequest('<%= message[i] %>')" style="color: #007bff;">✔</td>
      </tr>
      <% } %>
      `, { message })
    $('#receive').append(html)
  }).catch(e => {
    if (e.response) {
      alert('Plz login')
      location.href = '/login'
    }
  })
}

const requestFriend = () => {
  const username = prompt('Who?')
  axios.get('/api/friend/pow', { headers: { 'Access-Token': getCookie('token') } }).then(r => {
    const { pow } = r.data.message
    const answer = prompt(`pow: ${pow}`)
    axios.post(`/api/friend/request`, { pow: answer, from: username }, { headers: { 'Access-Token': getCookie('token') } }).then(r => {
      alert('Sent request')
      displayRequest()
    }).catch(e => {
      if (e.response) {
        const { message } = e.response.data
        if (Object.keys(message).length === 0) {
          alert('Error')
        } else {
          if (message === 'no user') alert('no user')
          else if (message === 'duplicate request') alert('already sent request')
          else if (message === 'request self') alert(`${username} is you!`)
          else if (message == 'pow Fail') alert('pow fail')
          else alert('Error')
        }
      }
    })
  })
}

const acceptRequest = (username, secret = '') => {
  axios.post('/api/friend/request', { from: username, secret }, { headers: { 'Access-Token': getCookie('token') } }).then(r => {
    alert('Accept!')
    displayFriend()
    displayRequest()
    displayReceive()
  }).catch(e => {
    if (e.response) {
      const { message } = e.response.data
      if (Object.keys(message).length === 0) {
        alert('Error')
      } else {
        if (message === 'no user') alert('no user')
        else if (message === 'duplicate request') alert('already sent request')
        else if (message === 'request self') alert(`${username} is you!`)
        else alert('Error')
      }
    }
  })
}

const visit = username => {
  axios.post('/api/friend/roomcode', { username }, { headers: { 'Access-Token': getCookie('token') } }).then(r => {
    const roomcode = r.data.message
    location.href = `/room/${roomcode}`
  }).catch(e => {
    if (e.response) {
      alert('not friend')
    } else {
      alert('error')
    }
  })
}

$(document).ready(function () {
  displayFriend()
  displayRequest()
  displayReceive()
  document.getElementById('requestFriend').addEventListener('click', requestFriend)
})