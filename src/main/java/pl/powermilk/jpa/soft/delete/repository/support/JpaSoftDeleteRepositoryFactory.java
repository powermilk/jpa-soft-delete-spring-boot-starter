package pl.powermilk.jpa.soft.delete.repository.support;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.RepositoryMetadata;
import pl.powermilk.jpa.soft.delete.repository.SoftDelete;

import javax.persistence.EntityManager;

/**
 * @author yuequan
 * @author powermilk
 */
public class JpaSoftDeleteRepositoryFactory extends JpaRepositoryFactory {
    /**
     * Creates a new {@link JpaRepositoryFactory}.
     *
     * @param entityManager must not be {@literal null}
     */
    JpaSoftDeleteRepositoryFactory(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
        if (metadata.getRepositoryInterface().isAnnotationPresent(SoftDelete.class)) {
            return JpaSoftDeleteRepository.class;
        }

        return super.getRepositoryBaseClass(metadata);
    }
}