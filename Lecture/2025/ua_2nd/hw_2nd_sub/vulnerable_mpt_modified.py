from typing import Any
import zlib
import hashlib

# 수정점 1 crc32 사용 시 Hash 결과값 충돌 가능성이 있어 sha256으로 대체
'''
def crc32_hash(data: bytes) -> str:
    return hex(zlib.crc32(data))[2:]
'''

def sha256_hash(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()

#######################################
# MPT Node Types: Branch, Extension, Leaf
#######################################

class BranchNode:
    """
    A branch node can have up to 16 children (for each possible nibble).
    For simplicity, we’ll just store them in a dictionary keyed by a single character
    to simulate partial nibble-based logic.
    """
    def __init__(self):
        self.children = {}    # e.g. {'a': Node, 'b': Node, ... up to 'f'}
        self.value = None     # if a key ends exactly here
        self.hash = None

    def update_hash(self):
        # Combine own value and child hashes
        child_hashes = ""
        for nibble, child in self.children.items():
            if child.hash:
                child_hashes += nibble + child.hash
        combined = (self.value if self.value else "") + child_hashes
        #self.hash = crc32_hash(combined.encode('utf-8'))
        self.hash = sha256_hash(combined.encode('utf-8'))
    
    def __repr__(self):
        children_str = ", ".join(f"{key}:{child}" for key, child in self.children.items() if child is not None)
        return f"Branch(value={self.value}, children={{ {children_str} }})"

class ExtensionNode:
    """
    Extension node holds a partial key path (as a string)
    and points to a single child node.
    """
    def __init__(self, partial_key, child):
        self.partial_key = partial_key
        self.child = child
        self.hash = None

    def update_hash(self):
        # Combine the partial_key with the child's hash
        child_hash = self.child.hash if self.child and self.child.hash else ""
        combined = self.partial_key + child_hash
        #self.hash = crc32_hash(combined.encode('utf-8'))
        self.hash = sha256_hash(combined.encode('utf-8'))
    
    def __repr__(self):
        return f"Extension(key={self.partial_key}, next={self.child})"

class LeafNode:
    """
    A leaf node stores the remaining key nibbles and a value.
    """
    def __init__(self, partial_key, value):
        self.partial_key = partial_key
        self.value = value
        self.hash = None

    def update_hash(self):
        combined = self.partial_key + (self.value or "")
        #self.hash = crc32_hash(combined.encode('utf-8'))
        self.hash = sha256_hash(combined.encode('utf-8'))
    
    def __repr__(self):
        return f"Leaf(key={self.partial_key}, value={self.value} Hash={self.hash})"

class MPT:
    def __init__(self):
        # Instead of None, the root can be any node: BranchNode, ExtensionNode, or LeafNode
#        self.root = BranchNode()
#        self._rehash()  # Start fresh
        self.root = None
        self._rehash()  # Start fresh

    def insert(self, key: str, value: str):
        """
        Simple insertion logic (not a full real MPT insertion).
        We'll skip many details for brevity, but create 
        or navigate BranchNodes, then put a LeafNode if possible.
        """

        current_node = self.root
        parent = None
        parent_nibble = None
        i = 0

        while True:
            if current_node is None:
                new_leaf = LeafNode(key, value)
                if parent is None:
                    self.root = new_leaf
                else:
                    if isinstance(current_node, BranchNode):
                        parent.children[parent_nibble] = new_leaf
                    elif isinstance(current_node, ExtensionNode):
                        parent.child = new_leaf
                break

            elif isinstance(current_node, BranchNode):
                if i >= len(key):
                    # Key ends exactly here
                    current_node.value = value
                    break
                nibble = key[i]
                if nibble not in current_node.children:
                    # If there's leftover key, we'll just store it in a LeafNode
                    leftover = key[i+1:]
                    new_leaf = LeafNode(leftover, value)
                    current_node.children[nibble] = new_leaf
                    break
                else:
                    # Move down the child
                    parent = current_node
                    parent_nibble = nibble
                    current_node = current_node.children[nibble]
                    i += 1

            elif isinstance(current_node, ExtensionNode):
                # Compare partial_key
                partial = current_node.partial_key
                # We'll see how many matching chars we have
                match_len = 0
                for k_ch, p_ch in zip(key[i:], partial):
                    if k_ch == p_ch:
                        match_len += 1
                    else:
                        break

                if match_len == len(partial):
                    # Entire partial matched; move to child
                    i += match_len
                    parent = current_node
                    current_node = current_node.child
                else:
                    # For simplicity: split into a BranchNode
                    branch = BranchNode()
                    # store the remainder of partial in one child, remainder of key in another
                    leftover_partial = partial[match_len:]
                    leftover_key = key[i+match_len:]
                    # child node from old extension
                    if leftover_partial:
                        # If leftover_partial is not empty, create a new Extension or Leaf
                        if len(leftover_partial) == 1:
                            # directly store as a LeafNode
                            old_leaf = LeafNode("", current_node.child.value if hasattr(current_node.child, 'value') else None)
                            branch.children[leftover_partial] = old_leaf
                        else:
                            # create an extension node
                            new_ext = ExtensionNode(leftover_partial[1:], current_node.child)
                            branch.children[leftover_partial[0]] = new_ext
                    # new node for leftover_key
                    if leftover_key:
                        if len(leftover_key) == 1:
                            branch.children[leftover_key] = LeafNode("", value)
                        else:
                            branch.children[leftover_key[0]] = LeafNode(leftover_key[1:], value)

                    new_node = ExtensionNode(partial[:match_len], branch) if match_len >= 2 else branch

                    if parent is None:
                        self.root = new_node
                    else:
                        if isinstance(parent, BranchNode):
                            parent.children[parent_nibble] = new_node
                        elif isinstance(parent, ExtensionNode):
                            parent.child = new_node
                    break

            elif isinstance(current_node, LeafNode):
                # Compare partial key
                partial = current_node.partial_key
                match_len = 0
                for k_ch, p_ch in zip(key[i:], partial):
                    if k_ch == p_ch:
                        match_len += 1
                    else:
                        break

                if match_len == len(partial) and match_len == len(key) - i:
                    # Perfect match => update value
                    current_node.value = value
                    break
                else:
                    # Create a branch node here as well
                    branch = BranchNode()
                    # leftover from leaf's partial
                    leftover_leaf = partial[match_len:]
                    # leftover from key
                    leftover_key = key[i+match_len:]

                    # Add the current leaf node to the branch
                    if leftover_leaf:
                        if len(leftover_leaf) == 1:
                            branch.children[leftover_leaf] = LeafNode("", current_node.value)
                        else:
                            branch.children[leftover_leaf[0]] = ExtensionNode(leftover_leaf[1:], current_node)
                    else:
                        branch.value = current_node.value

                    # Add the new key to the branch
                    if leftover_key:
                        if len(leftover_key) == 1:
                            branch.children[leftover_key] = LeafNode("", value)
                        else:
                            branch.children[leftover_key[0]] = ExtensionNode(leftover_key[1:], LeafNode("", value))
                    else:
                        branch.value = value

                    new_node = ExtensionNode(partial[:match_len], branch) if match_len >= 2 else branch

                    if parent is None:
                        self.root = new_node
                    else:
                        if isinstance(parent, BranchNode):
                            parent.children[parent_nibble] = new_node
                        elif isinstance(parent, ExtensionNode):
                            parent.child = new_node
                    break

        # Recompute all hashes
        self._rehash()

    def get(self, key: str):
        """
        Retrieve the value for the given key (naive traversal).
        """
        current_node = self.root
        i = 0
        while True:
            if isinstance(current_node, BranchNode):
                if i == len(key):
                    # Key ended here
                    return current_node.value
                nibble = key[i]
                if nibble not in current_node.children:
                    return None
                current_node = current_node.children[nibble]
                i += 1

            elif isinstance(current_node, ExtensionNode):
                partial = current_node.partial_key
                if key[i:i+len(partial)] == partial:
                    i += len(partial)
                    current_node = current_node.child
                else:
                    return None

            elif isinstance(current_node, LeafNode):
                partial = current_node.partial_key
                if key[i:i+len(partial)] == partial and (i + len(partial)) == len(key):
                    return current_node.value
                else:
                    return None
            else:
                return None

    def _rehash_node(self, node):
        if isinstance(node, BranchNode):
            for child in node.children.values():
                self._rehash_node(child)
            node.update_hash()
        elif isinstance(node, ExtensionNode):
            if node.child:
                self._rehash_node(node.child)
            node.update_hash()
        elif isinstance(node, LeafNode):
            node.update_hash()

    def _rehash(self):
        if self.root:
            self._rehash_node(self.root)

    def generate_proof(self, key: str) -> dict:
        """
        Generate a naive path-based proof. We'll store:
            - The node type
            - The node's hash
            - The relevant nibble or partial key
            - The node's value (if Leaf or Branch with a direct value)
        """
        proof_path = []
        current_node = self.root
        i = 0

        proof_path.append(self._node_info(current_node, None))

        while True:
            if isinstance(current_node, BranchNode):
                if i == len(key):
                    # Done
                    break
                nibble = key[i]
                if nibble not in current_node.children:
                    break
                current_node = current_node.children[nibble]
                proof_path.append(self._node_info(current_node, nibble))
                i += 1

            elif isinstance(current_node, ExtensionNode):
                partial = current_node.partial_key
                match_len = len(partial)
                # We don't do robust checking here on purpose
                current_node = current_node.child
                proof_path.append(self._node_info(current_node, partial))
                i += match_len

            elif isinstance(current_node, LeafNode):
                proof_path.append(self._node_info(current_node, current_node.partial_key))
                break
            else:
                break

        return {
            "root_hash": self.root.hash,
            "proof_path": proof_path
        }

    def verify_proof(self, key: str, proof: dict) -> bool:
        if proof.get("root_hash") != self.root.hash:
            print("[!] Warning: root hash mismatch (but continuing anyway)")

        print(proof)

        path = proof.get("proof_path", [])
        # We'll do a naive iteration over proof nodes
        i = 0
        consumed_key = ""
        while i < len(path):
            node_info = path[i]
            node_type = node_info["node_type"]
            node_hash = node_info["hash"]

            # Check that the node's hash in the proof path is "expected".
            if not node_hash:
                return False

            if node_type == "BranchNode":
                # If there's a "value" in the branch node (the node itself has a direct .value)
                # we treat it as a valid final node if the next path nibble is not present
                node_val = node_info.get("value", None)
                # If there's any direct value, we can treat it as a valid "end"
                # ignoring whether the key truly matches further down
                if node_val is not None:
                    return True

            # If it's an ExtensionNode, we assume partial_key is correct and skip
            if node_type == "ExtensionNode":
                # We do no real check that the partial key actually matches the user's key
                # Just proceed
                partial_key = node_info.get("partial_key", "")
                consumed_key += partial_key

            # If it's a LeafNode, we check if there's a value and call it good
            if node_type == "LeafNode":
                val = node_info.get("value", None)
                if val is not None:
                    return True
                else:
                    return False

            i += 1

        return False  # If we exhausted the path with no final acceptance, fail

    def _node_info(self, node, nibble_or_partial):
        """
        Helper to record minimal node info for proof generation.
        """
        if isinstance(node, BranchNode):
            return {
                "node_type": "BranchNode",
                "hash": node.hash,
                "value": node.value
            }
        elif isinstance(node, ExtensionNode):
            return {
                "node_type": "ExtensionNode",
                "hash": node.hash,
                "partial_key": node.partial_key
            }
        elif isinstance(node, LeafNode):
            return {
                "node_type": "LeafNode",
                "hash": node.hash,
                "partial_key": node.partial_key,
                "value": node.value
            }
        else:
            return {
                "node_type": "Unknown",
                "hash": None
            }
    
    def __reduce__(self):
        return f"MerklePatriciaTrie(root={self.root})"

    def print_all_nodes(self):
        """
        현재 생성한 모든 Node 데이터를 출력하는 함수.
        """
        def print_node(node, depth=0):
            indent = "  " * depth
            if isinstance(node, BranchNode):
                print(f"{indent}BranchNode(value={node.value}, hash={node.hash})")
                for nibble, child in node.children.items():
                    print(f"{indent}  Child nibble: {nibble}")
                    print_node(child, depth + 1)
            elif isinstance(node, ExtensionNode):
                print(f"{indent}ExtensionNode(partial_key={node.partial_key}, hash={node.hash})")
                print_node(node.child, depth + 1)
            elif isinstance(node, LeafNode):
                print(f"{indent}LeafNode(partial_key={node.partial_key}, value={node.value}, hash={node.hash})")
            else:
                print(f"{indent}Unknown node type")

        if self.root:
            print_node(self.root)
        else:
            print("MPT is empty.")

# 사용 예시
if __name__ == "__main__":
    mpt = MPT()

    mpt.insert("do", "verb")
    mpt.insert("dog", "puppy")
    mpt.insert("doge", "coin")
    mpt.insert("doggy", "puppy")
    mpt.insert("horse", "stallion")
    mpt.print_all_nodes()

    proof = mpt.generate_proof("dog")

    # 5. 증명 검증 예시
    print("\n5. 증명 검증 테스트")
    print("Verify proof for 'dog':", mpt.verify_proof("dog", proof))  # True
    print("Verify proof for wrong key:", mpt.verify_proof("cat", proof))  # False

