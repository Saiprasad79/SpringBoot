package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository implements BaseRepository {

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(Example arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll(Example arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAllById(Iterable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getOne(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List saveAll(Iterable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object saveAndFlush(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional findById(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object save(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count(Example arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean exists(Example arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Page findAll(Example arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional findOne(Example arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
