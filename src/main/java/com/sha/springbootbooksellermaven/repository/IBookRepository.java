package com.sha.springbootbooksellermaven.repository;

import com.sha.springbootbooksellermaven.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 3.07.2021
 * @time 17:55
 */
public interface IBookRepository extends JpaRepository<Book, Long>
{
}
