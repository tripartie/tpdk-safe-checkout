# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.28
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.unprocessable_entity_violations_inner import UnprocessableEntityViolationsInner

class TestUnprocessableEntityViolationsInner(unittest.TestCase):
    """UnprocessableEntityViolationsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UnprocessableEntityViolationsInner:
        """Test UnprocessableEntityViolationsInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UnprocessableEntityViolationsInner`
        """
        model = UnprocessableEntityViolationsInner()
        if include_optional:
            return UnprocessableEntityViolationsInner(
                property_path = 'firstName',
                message = 'This value should not be blank.',
                code = 'c1051bb4-d103-4f74-8988-acbcafc7fdc3'
            )
        else:
            return UnprocessableEntityViolationsInner(
        )
        """

    def testUnprocessableEntityViolationsInner(self):
        """Test UnprocessableEntityViolationsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
