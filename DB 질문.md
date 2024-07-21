
## <a id="1">트랜잭션의 격리 수준에 대해 설명하라</a>
- READ UNCOMMITTED: 타 트랜잭션에서 커밋되지 않은 내용도 참조 가능
- READ COMMITTED: 커밋된 내용만 참조 가능
- REPETABLE READ: 트랜잭션에 진입하기 이전에 커밋된 내용만 참조 가능
- SERIALIZABLE: 트랜잭션에 진입하면 락을 걸어 타 트랜잭션이 접근 못하게 막음

