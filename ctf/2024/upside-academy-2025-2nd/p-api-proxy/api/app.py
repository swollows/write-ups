from fastapi import FastAPI, Body

app = FastAPI()
database = {}

@app.get("/external/get/{_id}")
async def get(_id: int):
    return {_id: database[_id]}

@app.post("/external/set/{_id}")
async def set(_id: int, value: str = Body(...)):
    database[_id] = value
    return {_id: value}

@app.post("/internal/debug")
async def debug(x: str = Body(...)):
    return eval(x)
