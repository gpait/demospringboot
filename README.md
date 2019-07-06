#### ConfigMap

```bash
oc create configmap openshift-spring-boot-demo-config-map --from-literal=greeting.message="Hello"
```

```bash
oc get configmap openshift-spring-boot-demo-config-map -o yaml
```

#### Secret

```bash
oc create secret openshift-spring-boot-demo-secret --from-literal=greeting.secret="H3ll0"
```

```bash
oc get secret openshift-spring-boot-demo-secret -o yaml
```
