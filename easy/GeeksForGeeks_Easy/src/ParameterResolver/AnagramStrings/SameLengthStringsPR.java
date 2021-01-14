package ParameterResolver.AnagramStrings;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class SameLengthStringsPR implements ParameterResolver {
    @Override
    public boolean supportsParameter (
        ParameterContext parameterContext, ExtensionContext extensionContext)
        throws ParameterResolutionException
        {
            return parameterContext.getParameter().getType() == SameLengthStrings.class;

        }

    @Override
    public Object resolveParameter (
        ParameterContext parameterContext, ExtensionContext extensionContext)
        throws ParameterResolutionException
        {
            return new SameLengthStrings();

        }

}
