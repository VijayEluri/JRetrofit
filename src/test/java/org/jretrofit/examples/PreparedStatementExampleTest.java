package org.jretrofit.examples;

import java.sql.PreparedStatement;

import junit.framework.TestCase;

import org.jretrofit.Retrofit;

public class PreparedStatementExampleTest extends TestCase {
    public void testExecutePreparedStatementReturnsTrueOnSuccess()
            throws Exception {
        PreparedStatementStub stub = new PreparedStatementStub();
        PreparedStatement statement = Retrofit.partial(stub,
                PreparedStatement.class);
        assertTrue(new PreparedStatementExample()
                .executePreparedStatement(statement));
    }
}
