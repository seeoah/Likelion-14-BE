package com.likelion.seminar.repositpry;

import com.likelion.seminar.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
