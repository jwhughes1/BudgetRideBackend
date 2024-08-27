//package com.budgetride.backend.dao.Client;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//import com.budgetride.backend.core.Client;
//import com.budgetride.backend.entity.AccountJPA;
//import com.budgetride.backend.entity.ClientJPA;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//
//public class ClientDao implements ClientDaoInterface {
//
//    @Override
//    public long count() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'count'");
//    }
//
//    @Override
//    public void delete(ClientJPA entity) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'delete'");
//    }
//
//    @Override
//    public void deleteAll() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends ClientJPA> entities) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> ids) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
//    }
//
//    @Override
//    public boolean existsById(Long id) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
//    }
//
//    @Override
//    public Iterable<ClientJPA> findAll() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
//    }
//
//    @Override
//    public Iterable<ClientJPA> findAllById(Iterable<Long> ids) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
//    }
//
//    @Override
//    public Optional<ClientJPA> findById(Long id) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'findById'");
//    }
//
//    @Override
//    public <S extends ClientJPA> S save(S entity) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'save'");
//    }
//
//    @Override
//    public <S extends ClientJPA> Iterable<S> saveAll(Iterable<S> entities) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends ClientJPA> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends ClientJPA> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<ClientJPA> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public ClientJPA getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public ClientJPA getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public ClientJPA getReferenceById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends ClientJPA> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends ClientJPA> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends ClientJPA> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends ClientJPA> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends ClientJPA> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends ClientJPA> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends ClientJPA, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public List<ClientJPA> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<ClientJPA> findAll(Pageable pageable) {
//        return null;
//    }
//
//
//    // @PersistenceContext
//    // private EntityManager entityManager;
//
//}
