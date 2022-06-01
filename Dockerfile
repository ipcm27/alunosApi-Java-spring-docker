# quero um container que ja tenha jdk 17
FROM openjdk:17

# copia esse arquivo da minha máquina para dentro do container
# o parametro da esquerda é meu arquivo local e o da direita o arquivo dentro do container
COPY ./build/libs/api-alunos-igor-0.0.1-SNAPSHOT.jar api-alunos-igor-0.0.1-SNAPSHOT.jar

# executamos o jar da nossa app
CMD ["java", "-jar", "api-alunos-igor-0.0.1-SNAPSHOT.jar"]