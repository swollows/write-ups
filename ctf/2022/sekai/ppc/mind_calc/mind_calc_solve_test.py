import asyncio
import websockets
from os import path
from pydub import AudioSegment
import speech_recognition as sr

URL = "ws://mind-calculator.ctf.sekai.team/echo"
PATH = "./mind_calc_audio/"

prob_cnt = 0

async def my_connect():
    async with websockets.connect(URL) as websocket:
        await websocket.send("start")

        while True:
            global prob_cnt
            data_recv = await websocket.recv()
            print(data_recv)

            with open(PATH + str(prob_cnt) + ".mp3", 'wb') as f:
                while True:
                    data_recv = await websocket.recv()
                    length = len(data_recv)
                    if length != 0:
                        f.write(data_recv)
                    else:
                        break

            sound = AudioSegment.from_mp3(PATH + str(prob_cnt) + ".mp3")
            sound.export(PATH + str(prob_cnt) + "_conv.wav", format="wav")

            r = sr.Recognizer()

            with sr.AudioFile(PATH + str(prob_cnt) + "_conv.wav") as source:
                audio = r.record(source, duration=120)

            prob_cnt += 1

            vToText = r.recognize_google(audio_data=audio, language="en_US")
            Prob = vToText.replace("what is ", "").replace("plus","+").replace("minus", "-").replace("negative","-").replace(",", "").replace(" ", "").replace("--", "+").replace("-+", "-").replace("+-", "-").replace("++", "+")
            print(Prob)
            try:
                answer = str(eval(Prob))
            except: answer = str(0)
            print(answer)

            await websocket.send(answer)

asyncio.get_event_loop().run_until_complete(my_connect())