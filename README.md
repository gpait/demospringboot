#### ConfigMap

```bash
oc create configmap openshift-spring-boot-demo-config-map --from-literal=greeting.message="Hello"
```

```bash
oc get configmap openshift-spring-boot-demo-config-map -o yaml
```

#### Secret

```bash
oc create secret generic openshift-spring-boot-demo-secret \
    --from-literal=greeting.secret="H3ll0" \
    --from-literal=jwt.secret="demo"
```

```bash
oc get secret openshift-spring-boot-demo-secret -o yaml
```


#### Build and deploy

```bash
mvn clean install fabric8:deploy
```


#### Access customers

```bash
http http://customer-service-learning-openshift.192.168.99.101.nip.io/customers $HEADER
```

