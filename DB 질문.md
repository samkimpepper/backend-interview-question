
## <a id="1">트랜잭션의 격리 수준에 대해 설명하라</a>
- READ UNCOMMITTED: 타 트랜잭션에서 커밋되지 않은 내용도 참조 가능
- READ COMMITTED: 커밋된 내용만 참조 가능
- REPETABLE READ: 트랜잭션에 진입하기 이전에 커밋된 내용만 참조 가능
- SERIALIZABLE: 트랜잭션에 진입하면 락을 걸어 타 트랜잭션이 접근 못하게 막음

## <a id="2">커넥션 풀을 사용하는 이유</a>
커넥션은 TCP/IP 연결에 의한 3-way handshaking이 발생해서 연결 오래 걸리니까 한번 만들어두고 관리하는 것임.
