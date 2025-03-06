kubectl create serviceaccount pod-manager -n default
kubectl create role pod-manager-role --verb=create,delete,get,list,watch,patch --resource=pods -n default
kubectl create role pod-manager-role-execute --verb=create --resource=pods/exec -n default
kubectl create rolebinding pod-manager-binding --role=pod-manager-role --serviceaccount=default:pod-manager -n default
kubectl create rolebinding pod-manager-execute-binding --role=pod-manager-role-execute --serviceaccount=default:pod-manager -n default
kubectl create namespace flag
kubectl -n flag apply -f yaml