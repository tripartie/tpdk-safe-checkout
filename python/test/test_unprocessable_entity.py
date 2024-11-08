# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.113
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.unprocessable_entity import UnprocessableEntity

class TestUnprocessableEntity(unittest.TestCase):
    """UnprocessableEntity unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UnprocessableEntity:
        """Test UnprocessableEntity
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UnprocessableEntity`
        """
        model = UnprocessableEntity()
        if include_optional:
            return UnprocessableEntity(
                type = 'https://tools.ietf.org/html/rfc2616#section-10',
                title = 'An error occurred',
                detail = 'firstName: This value should not be blank.
lastName: This value should not be blank.
email: This value should not be null.
plainPassword: This value should not be null.
originCountry: This value should not be null.
preferredLanguage: This value should not be null.',
                violations = [
                    tpdk_safe_checkout.models.unprocessable_entity_violations_inner.UnprocessableEntity_violations_inner(
                        property_path = 'firstName', 
                        message = 'This value should not be blank.', 
                        code = 'c1051bb4-d103-4f74-8988-acbcafc7fdc3', )
                    ]
            )
        else:
            return UnprocessableEntity(
        )
        """

    def testUnprocessableEntity(self):
        """Test UnprocessableEntity"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
