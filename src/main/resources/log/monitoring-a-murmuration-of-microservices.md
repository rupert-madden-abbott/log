# Monitoring a Murmuration of Microservices

## Prerequisites

[Install Docker](https://docs.docker.com/get-docker/)
```shell
sudo snap install docker
```

[Install kind](https://kind.sigs.k8s.io/docs/user/quick-start/)
```shell
curl -Lo ./kind https://kind.sigs.k8s.io/dl/v0.11.1/kind-linux-amd64
chmod +x ./kind
mv ./kind /some-dir-in-your-PATH/kind
```

[Install kubectl](https://kubernetes.io/docs/tasks/tools/#kubectl)
```shell
sudo snap install kubectl
```

Create a k8s cluster using kind:
```shell
kind create cluster
```

Configure the kind 