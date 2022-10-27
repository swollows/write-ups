const drawInit = async info => {
  const canvas = document.querySelector('canvas')
  const ctx = canvas.getContext('2d')
  const inside = (point, vs) => {  // https://stackoverflow.com/questions/22521982/check-if-point-is-inside-a-polygon,  https://wrf.ecse.rpi.edu/Research/Short_Notes/pnpoly.html/pnpoly.html
    let x = point[0], y = point[1];

    let inside = false;
    for (let i = 0, j = vs.length - 1; i < vs.length; j = i++) {
      let xi = vs[i][0], yi = vs[i][1]
      let xj = vs[j][0], yj = vs[j][1]

      let intersect = ((yi > y) != (yj > y)) && (x < (xj - xi) * (y - yi) / (yj - yi) + xi)
      if (intersect) inside = !inside
    }
    return inside
  }

  const processFile = (type, file) => {
    const reader = new FileReader()
    reader.readAsDataURL(file)
    reader.onload = function () {
      data = {
        type,
        filename: file.name,
        filedata: reader.result.split(',')[1]
      }
      axios.post('/api/room/upload', data, { headers: { 'Access-Token': getCookie('token') } }).then(r => {
        if (type === 'wallpaper') drawWallpaper(ctx, r.data.message.wallpaper)
        else if (type === 'photoframe') drawPhotoframe(ctx, r.data.message.photoframe)
        else if (type === 'monitor') drawMonitor(ctx, r.data.message.monitor)
      }).catch(e => {
        alert('error')
      })
    }
    reader.onerror = function (error) {
      console.log('Error: ', error)
    }
  }

  const clickEvent = (canvas, e) => {
    const rect = canvas.getBoundingClientRect()
    const x = e.clientX - rect.left;
    const y = e.clientY - rect.top;
    
    const photoframe = [[669, 200], [669.7, 50], [920, 65], [918, 225]]
    const monitor = [[10, 500], [570, 230], [570, 5], [10, 220]]
    const wall = [[0, 550], [600, 250], [1000, 300], [1100, 430], [650, 800], [0, 800]]
    if (inside([x, y], photoframe)) {
      var file = document.querySelector('#uploadfile')
      file.onchange = e => {
        processFile('photoframe', e.target.files[0])
        e.target.value = ''
        e.target.onchange = () => {}
      }
      $('#uploadfile').click()
    } else if (inside([x, y], monitor)) {
      var file = document.querySelector('#uploadfile')
      file.onchange = e => {
        processFile('monitor', e.target.files[0])
        e.target.value = ''
        e.target.onchange = () => { }
      }
      $('#uploadfile').click()
    } else if (inside([x, y], wall)) {
      var file = document.querySelector('#uploadfile')
      file.onchange = e => {
        processFile('wallpaper', e.target.files[0])
        e.target.value = ''
        e.target.onchange = () => { }
      }
      $('#uploadfile').click()
    } 
  }
  
  const hoverEvent = (canvas, e) => {
    const rect = canvas.getBoundingClientRect()
    const x = e.clientX - rect.left;
    const y = e.clientY - rect.top;
    
    const photoframe = [[669, 200], [669.7, 50], [920, 65], [918, 225]]
    const monitor = [[10, 500], [570, 230], [570, 5], [10, 220]]
    const wall = [[0, 550], [600, 250], [1000, 300], [1100, 430], [650, 800], [0, 800]]

    if (inside([x,y], photoframe)) document.body.style.cursor = 'pointer'
    else if (inside([x, y], monitor)) document.body.style.cursor = 'pointer'
    else if (inside([x, y], wall)) document.body.style.cursor = 'pointer'
    else document.body.style.cursor = ''
  }

  const drawWallpaper = async (ctx, wallpaper) => {
    let pattern

    try{
      if (wallpaper !== null) {
        const result = await fetch(`/uploads/${wallpaper}`)
        const blob = await result.blob()
        const image = await createImageBitmap(blob)
        pattern = ctx.createPattern(image, 'repeat')
      }
    } catch(e) {}
    ctx.beginPath()
    ctx.moveTo(0, 550)
    ctx.lineTo(600, 250)
    ctx.lineTo(1000, 300)
    ctx.lineTo(1000, 500)
    ctx.lineTo(650, 800)
    ctx.lineTo(0, 800)
    ctx.stroke()
    ctx.fillStyle = pattern
    ctx.fill()

    // upper line
    ctx.beginPath()
    ctx.moveTo(600, 250)
    ctx.lineTo(600, 0)
    ctx.stroke()
  }

  const drawPhotoframe = async (ctx, photoframe) => {
    let pattern
    try {
      if (photoframe !== null) {
        const result = await fetch(`/uploads/${photoframe}`)
        const blob = await result.blob()
        const image = await createImageBitmap(blob)
        pattern = ctx.createPattern(image, 'repeat')
      }
    } catch (e) {}
    ctx.beginPath()
    ctx.moveTo(649 + 20, 200)
    ctx.lineTo(649.7 + 20, 50)
    ctx.lineTo(900 + 20, 65)
    ctx.lineTo(898 + 20, 225)
    ctx.lineTo(649 + 20, 200)
    ctx.stroke()
    ctx.fillStyle = pattern
    ctx.fill()
  }

  const drawMonitor = async (ctx, monitor) => {
    let pattern
    try {
      if (monitor !== null) {
        const result = await fetch(`/uploads/${monitor}`)
        const blob = await result.blob()
        const image = await createImageBitmap(blob)
        pattern = ctx.createPattern(image, 'repeat')
      }
    } catch (e) {}
    ctx.beginPath()
    ctx.moveTo(10, 500)
    ctx.lineTo(570, 230)
    ctx.lineTo(570, 5)
    ctx.lineTo(10, 220)
    ctx.lineTo(10, 500)
    ctx.stroke()
    ctx.fillStyle = pattern
    ctx.fill()
  }

  canvas.addEventListener('click', (e) => {
    clickEvent(canvas, e)
  })
  canvas.addEventListener('mousemove', (e) => {
    hoverEvent(canvas, e)
  })
 
  drawWallpaper(ctx, info.wallpaper)
  drawPhotoframe(ctx, info.photoframe)
  drawMonitor(ctx, info.monitor)
 
  // block
  ctx.beginPath()
  ctx.moveTo(650, 800)
  ctx.lineTo(1000, 500)
  ctx.stroke()
}

const playSong = music => {
  if (music !== null) {
    const audio = new Audio(`/uploads/${music}`)
    document.body.addEventListener('mousemove', (e) => {
      audio.play().then(r => {
        document.body.addEventListener('mousemove', ()=>{})
      })
    })
  }
}

const changeSong = e => {
  var file = document.querySelector('#uploadfile')
  file.onchange = e => {
    const file = e.target.files[0]
    const reader = new FileReader()
    reader.readAsDataURL(file)
    reader.onload = function () {
      data = {
        type: 'music',
        filename: file.name,
        filedata: reader.result.split(',')[1]
      }
      axios.post('/api/room/upload', data, { headers: { 'Access-Token': getCookie('token') } }).then(r => {
        playSong(r.data.message.music)
      }).catch(e => {
        alert('error')
      })
    }
    reader.onerror = function (error) {
      console.log('Error: ', error)
    }
    e.target.value = ''
    e.target.onchange = () => { }
  }
  $('#uploadfile').click()
}

const changeComment = () => {
  const target = prompt('Target')
  const index = prompt('Index')
  const edit = prompt('Edit')

  if (!(/^[a-zA-Z0-9]*$/.test(target)) || !(/^[0-9]*$/.test(index)) || !(/^[a-zA-Z0-9]*$/.test(edit))) return alert('Error')

  axios.post('/api/room/edit', { target, index, edit }, { headers: { 'Access-Token': getCookie('token') } }).then(r => {
    alert('Done')
    location.reload()
  }).catch(e => {
    alert('Error')
  })
}

$(document).ready(async function () {
  axios.get('/api/room', { headers: { 'Access-Token': getCookie('token') } }).then(r => {
    const info = r.data.message
    if (info.edit) {
      eval(`${info.target}['${info.index}']='${info.edit}'`)
    }
    $('#roomTitle').append(ejs.render(`
      Your Room<br>
      <p style="text-align: center; color: #000000; font-size: 16px">${info.comment}</p>
    `, { info }))

    drawInit(info)
    playSong(info.music)
    document.getElementById('changeMusic').addEventListener('click', changeSong) 
  }).catch(e => {
    if (e.response) {
      alert('Plz login')
      location.href = '/login'
    } 
  })
})