const drawInit = async info => {
  const canvas = document.querySelector('canvas')
  const ctx = canvas.getContext('2d')

  const drawWallpaper = async (ctx, wallpaper) => {
    let pattern

    if (wallpaper !== null) {
      const result = await fetch(`/uploads/${wallpaper}`)
      const blob = await result.blob()
      const image = await createImageBitmap(blob)
      pattern = ctx.createPattern(image, 'repeat')
    }
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
    if (photoframe !== null) {
      const result = await fetch(`/uploads/${photoframe}`)
      const blob = await result.blob()
      const image = await createImageBitmap(blob)
      pattern = ctx.createPattern(image, 'repeat')
    }
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
    if (monitor !== null) {
      const result = await fetch(`/uploads/${monitor}`)
      const blob = await result.blob()
      const image = await createImageBitmap(blob)
      pattern = ctx.createPattern(image, 'repeat')
    }
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
        document.body.addEventListener('mousemove', () => { })
      })
    })
  }
}

$(document).ready(async function () {
  axios.get(`/api/room/${uuid}`, { headers: { 'Access-Token': getCookie('token') } }).then(r => {
    const info = r.data.message
    if (info.edit) {
      eval(`${info.target}['${info.index}']='${info.edit}'`)
    }
    $('#title').append(ejs.render(`
      <%= info.username %>'s Room<br>
      <p style="text-align: center; color: #000000; font-size: 16px">${info.comment}</p>
    `, { info }))
    drawInit(info)
    playSong(info.music)
  }).catch(e => {
    if (e.response) {
      alert('Plz login')
      location.href = '/login'
    }
  })
})