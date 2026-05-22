import hashlib
import pickle
from multiprocessing import Pool, cpu_count
from tqdm import tqdm

def compute_chunk(args):
    start, end = args
    chunk = {}
    for i in range(start, end):
        h = str(i) + "salt_for_you"
        for _ in range(500):
            h = hashlib.sha1(h.encode()).hexdigest()
        chunk[h] = i
    return chunk

if __name__ == "__main__":
    total_start = 10000000
    total_end = 100000000
    chunk_size = 100000

    chunks = [(i, min(i + chunk_size, total_end)) for i in range(total_start, total_end, chunk_size)]

    table = {}
    with Pool(cpu_count()) as pool:
        for result in tqdm(pool.imap_unordered(compute_chunk, chunks), total=len(chunks), desc="Building table"):
            table.update(result)

    with open("table.pkl", "wb") as f:
        pickle.dump(table, f)
