# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.38
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.view import View

class TestView(unittest.TestCase):
    """View unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> View:
        """Test View
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `View`
        """
        model = View()
        if include_optional:
            return View(
                id = 56,
                ip_address = '',
                offer = 'https://example.com/',
                transaction = 'https://example.com/',
                user = 'https://example.com/',
                hit_count = 1,
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                named_source = 'BUYER'
            )
        else:
            return View(
                ip_address = '',
                hit_count = 1,
        )
        """

    def testView(self):
        """Test View"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
